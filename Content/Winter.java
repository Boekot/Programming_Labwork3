package Content;

import Content.Abstract.Participant;

public class Winter extends Participant{
    private String name;

    public Winter(String name) throws IllegalArgumentException{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must be a valid string.");
        }
        this.name = name;
    }

    @Override 
    public void performaceMove(PerformanceParams params, int step) {
        switch (step) {
            case 1:
                switch (params.winterstage()) {
                    case Early:
                        System.out.println("Как зима началась, стали они в лес собираться.");
                        break;
                    case Mid:
                        System.out.println("Как зима к середине подошла, стали они в лес собираться.");
                        break;
                    case Strong:
                        System.out.println("Как зима в полную силу вошла, стали они в лес собираться.");
                        break;
                    case Late:
                        System.out.println("Как зима стала к концу подходить, стали они в лес собираться.");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    @Override 
    public String toString() {
        return "{Winter: name="+name+"}";
    }
}
