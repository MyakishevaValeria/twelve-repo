/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_3;

/**
 * класс реализации интерфейса, фабрика для создания супер фигур
 */
public class SuperFigure implements FigureFactory {
    /**
     * метод для создания объекта класса нужного типа фигуры
     * @param type - тип фигуры
     * @return фигуру
     */
    @Override
    public Figure createFigure(FigureTypes type) {
        Figure figure = null;
        switch (type) {
            case figureJ:
                figure = new SuperFigure_J();
                break;
            case figureI:
                figure = new SuperFigure_I();
                break;
            case figureO:
                figure = new SuperFigure_O();
                break;
            default:
                throw new IllegalArgumentException("Wrong type:" + type);
        }
        return figure;
    }
}
