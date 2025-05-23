@SET PROJECT=bhistory
@SET VERSION=0.0.1-SNAPSHOT
@SET PROFILE=n100
@SET INSTALL_SCRIPT_FILE_NAME=install-%PROJECT%-%PROFILE%.bat
@SET DEPLOY_SCRIPT_FILE_NAME=deploy.bat
@SET SOURCE_DIR=C:\src\github\big-history
@SET DEPLOY_DIR=C:\deploy\%PROJECT%
@SET APACHE_TOMCAT=tomcat10
@SET LC_ALL=ko_KR.UTF-8
@REM
@REM
@REM start
@REM
DATE /t
TIME /t
ECHO %PROFILE% %INSTALL_SCRIPT_FILE_NAME% %DEPLOY_SCRIPT_FILE_NAME% %SOURCE_DIR% %DEPLOY_DIR% %APACHE_TOMCAT%
@REM
@REM
@REM git source
@REM
CD  %SOURCE_DIR%
git config --global core.quotepath false
git config pull.rebase false
git config pull.ff only
git stash
git clean -f
git pull
git log --pretty=format:"%%h - %%an, %%ai:%%ar : %%s" -8
@REM
@REM
@REM copy deploy script file
@REM
COPY /Y %SOURCE_DIR%\src\main\resources-%PROFILE%\%DEPLOY_SCRIPT_FILE_NAME%	%DEPLOY_DIR%
@REM
@REM
@REM run deploy script file
@REM
CD %DEPLOY_DIR%
CALL %DEPLOY_SCRIPT_FILE_NAME%
@REM