sudo apt-get update -y

sudo apt install -y openjdk-8-jdk

apt install -y maven

sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

sudo apt-get install docker-ce

sudo systemctl status docker


#chmod 777 install-jdk-maven.sh restart.sh start.sh
