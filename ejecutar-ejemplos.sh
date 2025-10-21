#!/bin/bash

echo "================================================"
echo "  PATRONES DE DISEÑO CREACIONALES - EJEMPLOS"
echo "================================================"
echo

echo "Compilando proyecto..."
mvn compile -q

if [ $? -ne 0 ]; then
    echo "Error al compilar el proyecto"
    exit 1
fi

echo
echo "Selecciona el ejemplo a ejecutar:"
echo
echo "1. Singleton"
echo "2. Factory Method"
echo "3. Prototype"
echo "4. Abstract Factory"
echo "5. Builder"
echo "6. Todos los ejemplos"
echo "0. Salir"
echo

read -p "Ingresa tu opción (0-6): " opcion

case $opcion in
    1)
        echo
        echo "Ejecutando Singleton..."
        java -cp target/classes com.patrones.creacionales.singleton.SingletonDemo
        ;;
    2)
        echo
        echo "Ejecutando Factory Method..."
        java -cp target/classes com.patrones.creacionales.factorymethod.FactoryMethodDemo
        ;;
    3)
        echo
        echo "Ejecutando Prototype..."
        java -cp target/classes com.patrones.creacionales.prototype.PrototypeDemo
        ;;
    4)
        echo
        echo "Ejecutando Abstract Factory..."
        java -cp target/classes com.patrones.creacionales.abstractfactory.AbstractFactoryDemo
        ;;
    5)
        echo
        echo "Ejecutando Builder..."
        java -cp target/classes com.patrones.creacionales.builder.BuilderDemo
        ;;
    6)
        echo
        echo "Ejecutando todos los ejemplos..."
        java -cp target/classes com.patrones.creacionales.Main
        ;;
    0)
        echo
        echo "Saliendo..."
        exit 0
        ;;
    *)
        echo
        echo "Opción inválida"
        ;;
esac

echo
read -p "Presiona Enter para continuar..."

