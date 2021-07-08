# meta-bootlink
Custom yocto meta for Diagnostic RPI4 B+ 


1- bluealsa systemd must be runned
2- rfkill unblock all
3- Use bluez ctl bluetoothctl

4- bluetoothctl > agent on
5- bluetoothctl > power on
6- bluetoothctl > scan on
7- bluetoothctl > devices
8- bluetoothctl > trust X:X:X:X:X;X
9- bluetoothctl > pair X:X:X:X:X;X 
10- bluetoothctl > connect X:X:X:X:X;X
11- bluetoothctl > quit

12- Record an audio by the default device usb pnp
arecord --format=S16_LE --rate=16000 --file-type=wav out.wav

13- Play audio over bl
aplay  -D bt out.wav


TODO: Try to record by bl:
Fix error

root@bootlink:~# arecord -D bluealsa capture.wav
ALSA lib ../../../git/src/asound/bluealsa-pcm.c:897:(_snd_pcm_bluealsa_open) Couldn't get BlueALSA PCM: PCM not found
arecord: main:828: audio open error: No such device


