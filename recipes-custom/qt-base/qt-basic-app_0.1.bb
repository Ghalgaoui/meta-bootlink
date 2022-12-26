SUMMARY = "Basic Qt5 application"
SECTION = "examples"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

# I want to make sure these get installed too.
DEPENDS += "qtbase"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Ghalgaoui/qtBasicApp.git;branch=master;protocol=https \
          file://basicQtApp.service"

S = "${WORKDIR}/git"
require recipes-qt/qt5/qt5.inc

inherit cmake_qt5

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install() {
      install -d ${D}${bindir}
      install -m 0755 basicQtApp ${D}${bindir}
      install -d ${D}/${base_libdir}/systemd/system
      install -Dm 0644 ${WORKDIR}/basicQtApp.service ${D}/${base_libdir}/systemd/system/basicQtApp.service
}

FILES_${PN} = "${base_libdir}/systemd/system"
