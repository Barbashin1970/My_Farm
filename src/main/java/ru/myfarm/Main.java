package ru.myfarm;

import ru.myfarm.details.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> farm = new ArrayList<>(Arrays.asList(
                "DOG Мухтар", "DOG Жучка",
                "CAT Мухтар", "CAT Пушок","CAT Рыжий","CAT Чистюля","CAT Молния",
                "HORSE Речка",
                "COW Вечер"
                ));
        AnimalFarm farmInit = new AnimalFarm(farm); // создали и наполнили ферму

        //  AnimalFarm farmInit = new AnimalFarm(List.of(
        //          "DOG Мухтар", "DOG Мухтарыч", "DOG Мухтарище",
        //
        // Если создать список через List.of() или Arrays.asList(), в них уже нельзя добавить или удалить элемент.

        System.out.println("Наша ферма в основании: ");
        System.out.println(farmInit);

        farmInit.addFarmAnimal(Animal.DOG);  // метод добавления животных в ферму
        farmInit.addFarmAnimal(Animal.DOG, "Мухтарище");
        farmInit.addFarmAnimal(Animal.CAT, "Рыжик");
        farmInit.addFarmAnimal(Animal.HORSE, "Гнедой");
        farmInit.addFarmAnimal(Animal.COW, "Зорька");
        farmInit.addFarmAnimal("Чебурашка");
        farmInit.addFarmAnimal("Гена_Крокодил");

        System.out.println("Наша ферма с новыми питомцами: ");                   // Выводим на печать
        System.out.println(farmInit.toString());                    // проверяем как переопределяется вывод на печать
        System.out.println("Всего на ферме живут " + farmInit.countedAnimals());  // выводим на печать количество животных каждого типа
        System.out.println("Уникальные клички " + farmInit.uniqueNames());      // выводим на печать уникальные клички

   }
}
