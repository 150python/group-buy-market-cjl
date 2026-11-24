1. 检出代码
   mkdir group-buy-market
   cd group-buy-market        
   git clone -b tag-v1.0 https://gitcode.net/KnowledgePlanet/group-buy-market.git

2. 打包代码
   mvn clean install

3. 构建镜像
   cd group-buy-market-app
   chmod +x build.sh

4. 部署项目
   cd /dev-ops/group-buy-market/group-buy-market/docs/tag/v1.0
   docker-compose -f docker-compose-app-v1.0.yml up -d