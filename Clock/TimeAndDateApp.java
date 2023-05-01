import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDateApp extends JFrame {
    private JLabel timeLabel;
    private JLabel dateLabel;

    public TimeAndDateApp() {
        // Set window properties
        setTitle("Time and Date App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setResizable(false);
        setLocationRelativeTo(null);

        // Create time label and set font
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create date label and set font
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add time and date labels to center of window
        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        centerPanel.add(timeLabel);
        centerPanel.add(dateLabel);
        add(centerPanel, BorderLayout.CENTER);

        // Update time and date every second
        Timer timer = new Timer(1000, e -> updateDateTime());
        timer.start();
    }

    private void updateDateTime() {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format date and time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = now.format(timeFormatter);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        String formattedDate = now.format(dateFormatter);

        // Update time and date labels
        timeLabel.setText(formattedTime);
        dateLabel.setText(formattedDate);
    }

    public static void main(String[] args) {
        TimeAndDateApp app = new TimeAndDateApp();
        app.setVisible(true);
    }
}
