# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Ghalgaoui/src-example.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "f187260181a97a16be3100d643fd764df079196d"

S = "${WORKDIR}/git"

TARGET_CFLAGS += "-DNDEBUG -DMY_OPTION"

# NOTE: no Makefile found, unable to determine what needs to be done

do_compile () {
	# Specify compilation commands here
	${CC} ${CFLAGS} ${LDFLAGS} ${S}/host.c -o ${WORKDIR}/host
}

do_install () {
	# Specify install commands here
	install -m 0755 -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/host ${D}${bindir}
}

