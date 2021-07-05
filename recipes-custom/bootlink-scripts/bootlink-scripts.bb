# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
SUMMARY = "bootlink scripts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = "file://ro"
SRC_URI += "file://rw"
SRC_URI += "file://play.wav"

# NOTE: no Makefile found, unable to determine what needs to be done
do_install () {
	install -d ${D}${sbindir}
	install -d ${D}${datadir}
	install -d ${D}${sysconfdir}
	install -m 0755 ${WORKDIR}/ro ${D}${sbindir}
	install -m 0755 ${WORKDIR}/rw ${D}${sbindir}
	install -m 0755 ${WORKDIR}/play.wav ${D}${datadir}
}

FILES_${PN} += "${sbindir}/ro"
FILES_${PN} += "${sbindir}/rw"
FILES_${PN} += "${datadir}/play.wav"
