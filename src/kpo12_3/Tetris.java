package kpo12_3;

import java.util.Random;


public class Tetris {
    public static void main(String[] args) {      
        Random random = new Random();  
        //получаем 10 фигур
        for(int i = 0; i < 10; i++) {
           //генерируем значение из двух вариантов выбора - обычные или супер фигуры
           SizeFigure size = SizeFigure.values()[random.nextInt(SizeFigure.values().length)];
           //если получили размер супер фигуры
           if (size == SizeFigure.superF){       
            SuperFigure figure = new SuperFigure();
            Figure randomFigure = getRandomFigure(figure); 
            //запускаем метод для получения рандомной фигуры
            creatRandomFigure(figure);
           } else {
               //иначе запускаем метод для получения рандомного типа обычной фигуры
               CommonFigure figure = new CommonFigure();
               creatRandomFigure(figure);
           } 
        }
    }
    
    public static void creatRandomFigure(CommonFigure factory) {
        Figure randomFigure = getRandomFigure(factory);   
        randomFigure.creatFigure(); 
    }
 
    public static Figure getRandomFigure(CommonFigure factory){
        Random random = new Random();
        //выбираем значение из трех вариантов фигур
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        return(factory.createFigure(type));
    }

    private static void creatRandomFigure(SuperFigure factory) {
        Figure randomFigure = getRandomFigure(factory); 
        randomFigure.creatFigure(); 
    }

    private static Figure getRandomFigure(SuperFigure factory) {
        Random random = new Random();
        //выбираем значение из трех вариантов фигур
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        return(factory.createFigure(type));
    }
    
}
