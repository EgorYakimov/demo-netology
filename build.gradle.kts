plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
//    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
//    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.0")
//    implementation()
//    runtimeOnly()

}

tasks.test {
    useJUnitPlatform()
}
//compile {
//
//}
//runtime{
//
//}

