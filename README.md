# Patrones de Diseño Creacionales - Ejemplos en Java

Este proyecto contiene ejemplos claros y bien documentados de los 5 patrones de diseño creacionales más importantes, basados en [Refactoring.Guru](https://refactoring.guru/es/design-patterns).

## 🎯 Objetivo

Proporcionar ejemplos simples y comprensibles de cada patrón, enfocándose en la implementación práctica sin complicaciones innecesarias.

## 📋 Patrones Implementados

### 1. **Singleton** - Instancia Única
- **Propósito**: Asegurar que una clase tenga solo una instancia
- **Cuándo usar**: Configuraciones globales, conexiones a BD, loggers
- **Ejemplo**: Sistema de configuración de aplicación
- **Archivos**: `Configuracion.java`, `SingletonDemo.java`

### 2. **Factory Method** - Método de Fabricación
- **Propósito**: Crear objetos sin especificar sus clases exactas
- **Cuándo usar**: Cuando no sabes qué tipo de objeto necesitas crear
- **Ejemplo**: Sistema de creación de documentos (PDF, Word)
- **Archivos**: `CreadorDocumento.java`, `DocumentoPDF.java`, `DocumentoWord.java`, `FactoryMethodDemo.java`

### 3. **Prototype** - Prototipo
- **Propósito**: Crear objetos clonando una instancia existente
- **Cuándo usar**: Cuando crear objetos es costoso o necesitas variaciones
- **Ejemplo**: Sistema de formas geométricas (círculos, rectángulos)
- **Archivos**: `Forma.java`, `Circulo.java`, `Rectangulo.java`, `PrototypeDemo.java`

### 4. **Abstract Factory** - Fábrica Abstracta
- **Propósito**: Crear familias de objetos relacionados
- **Cuándo usar**: Cuando necesitas productos compatibles entre sí
- **Ejemplo**: Sistema de componentes GUI (Windows vs Mac)
- **Archivos**: `FabricaGUI.java`, `Boton.java`, `CampoTexto.java`, `AbstractFactoryDemo.java`

### 5. **Builder** - Constructor Virtual
- **Propósito**: Construir objetos complejos paso a paso
- **Cuándo usar**: Objetos con muchos parámetros opcionales
- **Ejemplo**: Sistema de construcción de pizzas
- **Archivos**: `PizzaBuilder.java`, `Pizza.java`, `Cocinero.java`, `BuilderDemo.java`

## 🚀 Cómo Ejecutar

### Requisitos
- Java 11 o superior
- Maven 3.6 o superior

### Compilar el proyecto
```bash
mvn compile
```

### Ejecutar ejemplos individuales

#### Usando Java directamente (Recomendado)
```bash
# Singleton
java -cp target/classes com.patrones.creacionales.singleton.SingletonDemo

# Factory Method
java -cp target/classes com.patrones.creacionales.factorymethod.FactoryMethodDemo

# Prototype
java -cp target/classes com.patrones.creacionales.prototype.PrototypeDemo

# Abstract Factory
java -cp target/classes com.patrones.creacionales.abstractfactory.AbstractFactoryDemo

# Builder
java -cp target/classes com.patrones.creacionales.builder.BuilderDemo
```

#### Usando scripts interactivos
```bash
# Windows
ejecutar-ejemplos.bat

# Linux/Mac
chmod +x ejecutar-ejemplos.sh
./ejecutar-ejemplos.sh
```

### Ejecutar todos los ejemplos
```bash
java -cp target/classes com.patrones.creacionales.Main
```

## 📁 Estructura del Proyecto

```
src/main/java/com/patrones/creacionales/
├── singleton/
│   ├── Configuracion.java
│   └── SingletonDemo.java
├── factorymethod/
│   ├── CreadorDocumento.java
│   ├── Documento.java
│   ├── DocumentoPDF.java
│   ├── DocumentoWord.java
│   ├── CreadorPDF.java
│   ├── CreadorWord.java
│   └── FactoryMethodDemo.java
├── prototype/
│   ├── Forma.java
│   ├── Circulo.java
│   ├── Rectangulo.java
│   └── PrototypeDemo.java
├── abstractfactory/
│   ├── FabricaGUI.java
│   ├── Boton.java
│   ├── CampoTexto.java
│   ├── FabricaWindows.java
│   ├── FabricaMac.java
│   └── AbstractFactoryDemo.java
├── builder/
│   ├── PizzaBuilder.java
│   ├── Pizza.java
│   ├── PizzaHawaianaBuilder.java
│   ├── PizzaPepperoniBuilder.java
│   ├── Cocinero.java
│   └── BuilderDemo.java
└── Main.java
```

## 🎓 Conceptos Clave

### Patrones Creacionales
Los patrones creacionales proporcionan mecanismos para crear objetos de manera que se adapten a la situación. Aumentan la flexibilidad y reutilización del código existente.

### Ventajas de Usar Patrones
- **Reutilización**: Soluciones probadas para problemas comunes
- **Comunicación**: Lenguaje común entre desarrolladores
- **Flexibilidad**: Fácil modificación y extensión
- **Mantenibilidad**: Código más organizado y comprensible

## 📚 Referencias

- [Refactoring.Guru - Patrones de Diseño](https://refactoring.guru/es/design-patterns)
- [Gang of Four - Design Patterns](https://en.wikipedia.org/wiki/Design_Patterns)
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Fork el proyecto
2. Crea una rama para tu feature
3. Commit tus cambios
4. Push a la rama
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.
