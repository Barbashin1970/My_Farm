package ru.myfarm;

import ru.myfarm.details.AnimalFarm;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        AnimalFarm farmInit = new AnimalFarm(List.of(       // создали и наполнили ферму
                "DOG Мухтар", "DOG Мухтарыч", "DOG Мухтарище",
                "CAT Мухтар", "CAT Пушок","CAT Рыжик","CAT Чистюля","CAT Молния",
                "HORSE Речка",
                "COW Зорька"
        ));
      //  farmInit.addFarmAnimal(Animal.DOG);  // -- не работает метод добавления животных в ферму

        System.out.println("Наша ферма " + farmInit);                   // Выводим на печать нашу ферму
        System.out.println("Всего на ферме живут " + farmInit.countedAnimals());  // выводим на печать количество животных каждого типа
        System.out.println("Уникальные клички " + farmInit.uniqueNames());      // выводим на печать уникальные клички
        System.out.println(farmInit.toString()); // не переопределяется вывод на печать
   }
}
