// Menstrual Health: Diet + Yoga (Basic Java Project)
// ---------------------------------------------------
// Console-based program that gives simple diet & yoga tips
// depending on the selected menstrual phase.
// Author: Educational Example

import java.util.Scanner;

public class MenstrualHealthApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌸 Menstrual Health: Diet + Yoga 🌸");
        System.out.println("Choose your cycle phase:");
        System.out.println("1. Menstrual");
        System.out.println("2. Follicular");
        System.out.println("3. Ovulatory");
        System.out.println("4. Luteal");
        System.out.print("Enter phase name: ");

        String phase = sc.nextLine().trim().toLowerCase();

        switch (phase) {
            case "menstrual":
                System.out.println("\n✅ Recommended Foods:");
                System.out.println("- Iron-rich foods: spinach, beetroot, lentils");
                System.out.println("- Magnesium: nuts, dark chocolate");
                System.out.println("- Hydration: soups, fruits");

                System.out.println("\n🧘 Yoga Suggestions:");
                System.out.println("- Child’s Pose");
                System.out.println("- Reclined Bound Angle Pose");
                System.out.println("- Legs up the Wall");
                break;

            case "follicular":
                System.out.println("\n✅ Recommended Foods:");
                System.out.println("- Protein: eggs, paneer, legumes");
                System.out.println("- Complex carbs: oats, quinoa");
                System.out.println("- Probiotics: yogurt, fermented foods");

                System.out.println("\n🧘 Yoga Suggestions:");
                System.out.println("- Cobra Pose");
                System.out.println("- Bridge Pose");
                System.out.println("- Seated Forward Bend");
                break;

            case "ovulatory":
                System.out.println("\n✅ Recommended Foods:");
                System.out.println("- Fiber-rich salads & greens");
                System.out.println("- Zinc & B-vitamins: chickpeas, seeds");
                System.out.println("- Coconut water, lemon water");

                System.out.println("\n🧘 Yoga Suggestions:");
                System.out.println("- Warrior series");
                System.out.println("- Twists");
                System.out.println("- Cooling pranayama");
                break;

            case "luteal":
                System.out.println("\n✅ Recommended Foods:");
                System.out.println("- Magnesium: banana, cacao, nuts");
                System.out.println("- Calcium: milk/yogurt, sesame");
                System.out.println("- Reduce salt & caffeine");

                System.out.println("\n🧘 Yoga Suggestions:");
                System.out.println("- Cat-Cow");
                System.out.println("- Supine Twists");
                System.out.println("- Forward Fold");
                break;

            default:
                System.out.println("❌ Invalid input. Please enter one of: menstrual, follicular, ovulatory, luteal.");
        }

        sc.close();
    }
}
