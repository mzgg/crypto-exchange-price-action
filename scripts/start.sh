cd ../

git clone  https://github.com/mzgg/crypto-exchange-price-action.git

mvn clean install

echo y

cp  target/crypto*jar ../

cd ../

killall -9  java

nohup java -Xmx768m -Xms768m -Duser.timezone="Europe/Istanbul" -Dserver.port=5353 -jar crypto-exchange-price-action-0.0.1-SNAPSHOT.jar &

echo disown

touch nohup.out || exit

tail -f nohup.out
