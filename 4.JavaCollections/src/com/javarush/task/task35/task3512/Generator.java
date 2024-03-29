package com.javarush.task.task35.task3512;

public class Generator<T> {
    public Class<T> clazz;

    public Generator(Class<T> clazz) {
        this.clazz = clazz;
    }

    T newInstance() {
        try {
            return clazz.getConstructor().newInstance();
        } catch (ReflectiveOperationException e){
            e.printStackTrace();
        }
        return null;
    }
}
