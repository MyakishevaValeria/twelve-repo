package kpo12_3;

/**
 * класс реализации интерфейса, фабрика для создания обычных фигур
 */
public class CommonFigure implements FigureFactory {
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
                figure = new Figure_J();
                break;
            case figureI:
                figure = new Figure_I();
                break;
            case figureO:
                figure = new Figure_O();
                break;
            default:
                throw new IllegalArgumentException("Wrong type:" + type);
        }
        return figure;
    }
}
