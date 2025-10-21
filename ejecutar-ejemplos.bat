@echo off
echo ================================================
echo   PATRONES DE DISEÑO CREACIONALES - EJEMPLOS
echo ================================================
echo.

echo Compilando proyecto...
call mvn compile -q

if %ERRORLEVEL% neq 0 (
    echo Error al compilar el proyecto
    pause
    exit /b 1
)

echo.
echo Selecciona el ejemplo a ejecutar:
echo.
echo 1. Singleton
echo 2. Factory Method
echo 3. Prototype
echo 4. Abstract Factory
echo 5. Builder
echo 6. Todos los ejemplos
echo 0. Salir
echo.

set /p opcion="Ingresa tu opcion (0-6): "

if "%opcion%"=="1" (
    echo.
    echo Ejecutando Singleton...
    java -cp target/classes com.patrones.creacionales.singleton.SingletonDemo
) else if "%opcion%"=="2" (
    echo.
    echo Ejecutando Factory Method...
    java -cp target/classes com.patrones.creacionales.factorymethod.FactoryMethodDemo
) else if "%opcion%"=="3" (
    echo.
    echo Ejecutando Prototype...
    java -cp target/classes com.patrones.creacionales.prototype.PrototypeDemo
) else if "%opcion%"=="4" (
    echo.
    echo Ejecutando Abstract Factory...
    java -cp target/classes com.patrones.creacionales.abstractfactory.AbstractFactoryDemo
) else if "%opcion%"=="5" (
    echo.
    echo Ejecutando Builder...
    java -cp target/classes com.patrones.creacionales.builder.BuilderDemo
) else if "%opcion%"=="6" (
    echo.
    echo Ejecutando todos los ejemplos...
    java -cp target/classes com.patrones.creacionales.Main
) else if "%opcion%"=="0" (
    echo.
    echo Saliendo...
    exit /b 0
) else (
    echo.
    echo Opcion invalida
)

echo.
pause

