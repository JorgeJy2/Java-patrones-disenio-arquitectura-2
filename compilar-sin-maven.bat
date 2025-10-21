@echo off
echo ================================================
echo   COMPILANDO PROYECTO SIN MAVEN
echo ================================================
echo.

echo Creando directorio de clases...
mkdir target\classes 2>nul

echo.
echo Compilando todos los archivos Java...
echo Compilando Singleton...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\singleton\*.java
echo Compilando Factory Method...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\factorymethod\*.java
echo Compilando Prototype...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\prototype\*.java
echo Compilando Abstract Factory...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\abstractfactory\*.java
echo Compilando Builder...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\builder\*.java
echo Compilando Main...
javac -encoding UTF-8 -d target\classes src\main\java\com\patrones\creacionales\Main.java

if %ERRORLEVEL% equ 0 (
    echo.
    echo ✅ Compilación exitosa!
    echo.
    echo ¿Deseas ejecutar todos los ejemplos ahora? (s/n)
    set /p respuesta=
    if /i "%respuesta%"=="s" (
        echo.
        echo Ejecutando todos los ejemplos...
        echo ================================================
        java -cp target\classes com.patrones.creacionales.Main
    ) else (
        echo.
        echo Para ejecutar ejemplos individuales, usa:
        echo java -cp target\classes com.patrones.creacionales.singleton.SingletonDemo
        echo java -cp target\classes com.patrones.creacionales.factorymethod.FactoryMethodDemo
        echo java -cp target\classes com.patrones.creacionales.prototype.PrototypeDemo
        echo java -cp target\classes com.patrones.creacionales.abstractfactory.AbstractFactoryDemo
        echo java -cp target\classes com.patrones.creacionales.builder.BuilderDemo
    )
) else (
    echo.
    echo ❌ Error en la compilación
    echo Revisa que tengas Java instalado y que los archivos estén en la ubicación correcta
)

echo.
pause
