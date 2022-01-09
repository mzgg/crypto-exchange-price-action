
git pull https://mzgg:12345678@bitbucket.org/mzgg/kripto-arbitraj.git master

mvn clean install

echo y

cp  target/crypto*jar ../

cd ../

killall -9  java

nohup java -Xmx512m -Xms512m -Duser.timezone="Europe/Istanbul" -Dserver.port=5353 -jar crypto-exchange-price-action-0.0.1-SNAPSHOT.jar &

echo disown

touch nohup.out || exit

tail -f nohup.out
