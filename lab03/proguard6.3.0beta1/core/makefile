# GNU/Linux makefile for ProGuard.

KOTLIN_VERSION    = 1.3.31
KOTLIN_STDLIB_URL = https://jcenter.bintray.com/org/jetbrains/kotlin/kotlin-stdlib/$(KOTLIN_VERSION)/kotlin-stdlib-${KOTLIN_VERSION}.jar
KOTLIN_STDLIB_JAR = $(LIB)/kotlin-stdlib-$(KOTLIN_VERSION).jar

KOTLIN_STDLIB_COMMON_URL = https://jcenter.bintray.com/org/jetbrains/kotlin/kotlin-stdlib-common/$(KOTLIN_VERSION)/kotlin-stdlib-common-${KOTLIN_VERSION}.jar
KOTLIN_STDLIB_COMMON_JAR = $(LIB)/kotlin-stdlib-common-$(KOTLIN_VERSION).jar

KOTLINX_METADATA_VERSION = 0.1.0
KOTLINX_METADATA_JVM_URL = https://jcenter.bintray.com/org/jetbrains/kotlinx/kotlinx-metadata-jvm/$(KOTLINX_METADATA_VERSION)/kotlinx-metadata-jvm-${KOTLINX_METADATA_VERSION}.jar
KOTLINX_METADATA_JVM_JAR = $(LIB)/kotlinx-metadata-jvm-$(KOTLINX_METADATA_VERSION).jar

GSON_VERSION = 2.8.5
GSON_URL     = https://jcenter.bintray.com/com/google/code/gson/gson/${GSON_VERSION}/gson-${GSON_VERSION}.jar
GSON_JAR     = $(LIB)/gson-${GSON_VERSION}.jar

MAIN_CLASS       = proguard/ProGuard
CLASSPATH        = $(KOTLIN_STDLIB_JAR):$(KOTLIN_STDLIB_COMMON_JAR):$(KOTLINX_METADATA_JVM_JAR):$(GSON_JAR)
TARGET           = proguard
INCLUDE_MANIFEST = true

include ../buildscripts/functions.mk

$(KOTLIN_STDLIB_JAR):
	$(DOWNLOAD) $(KOTLIN_STDLIB_JAR) $(KOTLIN_STDLIB_URL)

$(KOTLIN_STDLIB_COMMON_JAR):
	$(DOWNLOAD) $(KOTLIN_STDLIB_COMMON_JAR) $(KOTLIN_STDLIB_COMMON_URL)

$(KOTLINX_METADATA_JVM_JAR):
	$(DOWNLOAD) $(KOTLINX_METADATA_JVM_JAR) $(KOTLINX_METADATA_JVM_URL)

$(GSON_JAR):
	$(DOWNLOAD) $(GSON_JAR) $(GSON_URL)
