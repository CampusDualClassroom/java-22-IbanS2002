package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String>lista= new ArrayList<>();
        lista.add("GKFFD");
        lista.add("TNANA");
        lista.add("MPMSL");
        lista.add("PSWME");
        lista.add("LZMLF");
        lista.add("JYEBV");
        lista.add("YELNT");
        lista.add("JSNKR");
        lista.add("JFESF");
        lista.add("TMJLL");
        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Índice: " + i + ", Valor: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {

        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();

        // Agregar un nuevo elemento a la lista
        boolean EAnadido = addElementToList(myList, "AAAAA");
        System.out.println("Elemento agregado: " + EAnadido);

        // Imprimir los elementos y sus índices
        printElementsAndIndex(myList);
    }


}
