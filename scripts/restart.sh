cd ../../

killall -9 java

nohup java -Xmx512m -Xms512m -Duser.timezone="Europe/Istanbul" -Dserver.port=5353 -jar crypto-exchange-price-action-0.0.1-SNAPSHOT.jar &

echo disown

tail -f nohup.out



