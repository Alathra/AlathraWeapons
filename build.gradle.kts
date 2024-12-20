plugins {
    `java-library`

    id("com.github.johnrengelman.shadow") version "8.1.1" // Shades and relocates dependencies, See https://imperceptiblethoughts.com/shadow/introduction/
    id("xyz.jpenilla.run-paper") version "2.1.0" // Adds runServer and runMojangMappedServer tasks for testing
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0" // Automatic plugin.yml generation
}

group = "me.ShermansWorld.AlathraWeapons"
version = "2.5.0"
description = ""

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17)) // Configure the java toolchain. This allows gradle to auto-provision JDK 17 on systems that only have JDK 8 installed for example.
}

repositories {
    mavenCentral()

    maven("https://papermc.io/repo/repository/maven-public/")

    maven("https://jitpack.io/") {
        content {
            includeGroup("com.github.milkdrinkers")
        }
    }

    maven("https://repo.codemc.org/repository/maven-public/") {
        content { includeGroup("dev.jorel") }
    }
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
    annotationProcessor("org.jetbrains:annotations:24.0.1")

    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")

    implementation("com.github.milkdrinkers:colorparser:2.0.0")

    implementation("dev.jorel:commandapi-bukkit-shade:9.3.0")
    compileOnly("dev.jorel:commandapi-annotations:9.3.0")
    annotationProcessor("dev.jorel:commandapi-annotations:9.3.0")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything

        // Set the release flag. This configures what version bytecode the compiler will emit, as well as what JDK APIs are usable.
        // See https://openjdk.java.net/jeps/247 for more information.
        options.release.set(17)
        options.compilerArgs.addAll(arrayListOf("-Xlint:all", "-Xlint:-processing", "-Xdiags:verbose"))
    }

    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }

    shadowJar {
        archiveBaseName.set(project.name)
        archiveClassifier.set("")

        // Shadow classes
        // helper function to relocate a package into our package
        fun reloc(originPkg: String, targetPkg: String) = relocate(originPkg, "${project.group}.deps.${targetPkg}")

        reloc("com.github.milkdrinkers.colorparser", "colorparser")
        reloc("dev.jorel.commandapi", "commandapi")
    }

    runServer {
        // Configure the Minecraft version for our task.
        minecraftVersion("1.20.1")

        // IntelliJ IDEA debugger setup: https://docs.papermc.io/paper/dev/debugging#using-a-remote-debugger
        jvmArgs("-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005")
        systemProperty("terminal.jline", false)
        systemProperty("terminal.ansi", true)
    }
}

bukkit { // Options: https://github.com/Minecrell/plugin-yml#bukkit
    // Plugin main class (required)
    main = "${project.group}.Main"

    // Plugin Information
    name = project.name
    prefix = "${project.name}"
    version = "${project.version}"
    description = "${project.description}"
    authors = listOf("ShermansWorld")
    contributors = listOf("NuclearDonut", "darksaid98")
    apiVersion = "1.19"

    // Misc properties
    load = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.POSTWORLD // STARTUP or POSTWORLD
    depend = listOf()
    softDepend = listOf()
}