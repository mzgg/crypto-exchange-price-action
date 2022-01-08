git pull https://github.com/mzgg/crypto-exchange-price-action.git master

mvn clean install

docker build -t crypto-exchange-price-action .

docker images

docker tag crypto-exchange-price-action mzgg/crypto-exchange-price-action

docker push mzgg/crypto-exchange-price-action