# meta-bootlink
Custom yocto meta

$ sudo curl http://commondatastorage.googleapis.com/git-repo-downloads/repo > /usr/local/sbin/repo

$ sudo chmod a+x /usr/local/sbin/repo

$ repo init https://github.com/Ghalgaoui/meta-rpi-diag.git -b dunfell -m rpi-diag.xml

$ repo sync 

$ source ./ 
