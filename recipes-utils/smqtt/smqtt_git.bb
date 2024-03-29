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
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4daebeaffd2a39ae50aa20535611abac"

DEPENDS = "paho-mqtt-c"

SRC_URI = "git://github.com/abrox/simplemqtt;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "57d3472e5a2f6af57d2877345bc99ecef8f1c679"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

