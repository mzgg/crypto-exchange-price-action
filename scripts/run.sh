echo Starting...

nohup java -Dcom.sun.management.jmxremote=true \
-Dcom.sun.management.jmxremote.port=9050 \
-Dcom.sun.management.jmxremote.rmi.port=9050 \
-Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false \
-Dexecutor.corePoolSize=100 \
-Xmx512m -Xms512m -Duser.timezone="Europe/Istanbul" \
-jar crypto-exchange-price-action-0.0.1-SNAPSHOT.jar > nohup.out 2>&1 & sleep 5 & disown &

echo $! > pid.txt

echo pid : `cat pid.txt` 

