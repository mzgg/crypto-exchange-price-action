cd ../

killall -9 java

nohup java -Xmx512m -Xms512m -Dexecutor.corePoolSize=100 -Duser.timezone="Europe/Istanbul" -Dlogging.level.com.momoli=debug -jar kripto-arbitraj-0.0.1-SNAPSHOT.jar &

echo disown

tail -f nohup.out



