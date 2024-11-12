@REM
@REM
@REM
SET HOME_DIR=%CD%
SET	SOURCE_DIR=%HOME_DIR%\src\main\resources
SET	TARGET_DIR=%HOME_DIR%\src\main\java\kr\andold\bhistory\antlr
SET	FILE_NAME_ANTLR_JAR=%HOME_DIR%\src\main\resources\antlr-4.10.1-complete.jar
SET	PACKAGE_ANTLR=kr.andold.bhistory.antlr
@REM
@REM
@REM
TIME /T
@REM
@REM
@REM
DEL /Q %TARGET_DIR%\*
@REM
@REM
@REM
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR% -visitor -o %TARGET_DIR% %SOURCE_DIR%\BigHistoryDateTime.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR% -visitor -o %TARGET_DIR% %SOURCE_DIR%\DateTime.g4
java -jar %FILE_NAME_ANTLR_JAR% -encoding UTF8 -package %PACKAGE_ANTLR% -visitor -o %TARGET_DIR% %SOURCE_DIR%\UniversalDateTime.g4
