# ParallelGrid
This is a parallel grid project
java -Dwebdriver.chrome.driver=C:\Web_Drivers\chromedriver.exe -jar C:\Web_Drivers\selenium-server-standalone.jar -role hub -hubConfig C:\Users\Dell\Workspace\ParallelCI\ParallelGrid\hub.json

java -Dwebdriver.chrome.driver=C:\Web_Drivers\chromedriver.exe -jar C:\Web_Drivers\selenium-server-standalone.jar -role node -nodeConfig C:\Users\Dell\Workspace\ParallelCI\ParallelGrid\node1.json

java -Dwebdriver.chrome.driver=C:\Web_Drivers\chromedriver.exe -jar C:\Web_Drivers\selenium-server-standalone.jar -role node -nodeConfig C:\Users\Dell\Workspace\ParallelCI\ParallelGrid\node2.json
