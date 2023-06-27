plugins {
    `java-library`

    id("com.github.johnrengelman.shadow") version "8.1.1" // Shades and relocates dependencies, See https://imperceptiblethoughts.com/shadow/introduction/
    id("xyz.jpenilla.run-paper") version "2.1.0" // Adds runServer and runMojangMappedServer tasks for testing
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0" // Automatic plugin.yml generation
}

group = "me.ShermansWorld.AlathraWeapons"
version = "1.4.0"
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
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")

    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")

    implementation("com.github.milkdrinkers:colorparser:1.0.5")
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
        options.compilerArgs.add("-Xlint:-deprecation")
    }

    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }

    shadowJar {
        archiveBaseName.set(project.name)
        archiveClassifier.set("")

        // Shadow classes
        // helper function to relocate a package into our package
        fun reloc(originPkg: String, targetPkg: String) = relocate(originPkg, "${project.group}.${targetPkg}")
    }

    runServer {
        // Configure the Minecraft version for our task.
        minecraftVersion("1.19.3")
    }
}

bukkit {
    // Plugin main class (required)
    main = "${project.group}.Main"

    // Plugin Information
    name = project.name
    prefix = "AlathraWeapons"
    version = "${project.version}"
    description = "${project.description}"
    authors = listOf("ShermansWorld")
    contributors = listOf("darksaid98")
    apiVersion = "1.19"

    // Misc properties
    load = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.POSTWORLD // STARTUP or POSTWORLD

    commands {
        register("weapons") {
            description = "Used to give weapons"
            usage = "Just use /weapons"
        }
    }
}