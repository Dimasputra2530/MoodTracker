/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihanp10dimasputranugroho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoodTracker extends javax.swing.JFrame {

    // Deklarasi variabel panel dan label
    private JPanel moodPanel;
    private JLabel titleLabel;
    private JLabel responseLabel;

    public MoodTracker() {
        // Set frame properties
        setTitle("Mood Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize components
        moodPanel = new JPanel();
        moodPanel.setLayout(new GridLayout(2, 2, 10, 10));
        moodPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        titleLabel = new JLabel("How Are You Feeling Today?", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        responseLabel = new JLabel("", SwingConstants.CENTER);
        responseLabel.setFont(new Font("Arial", Font.ITALIC, 16));

        // Create buttons for moods
        JButton happyButton = createMoodButton("Happy", new Color(255, 223, 0), "You seem happy! Keep smiling!");
        JButton sadButton = createMoodButton("Sad", new Color(135, 206, 250), "It's okay to feel sad. Take your time.");
        JButton angryButton = createMoodButton("Angry", new Color(255, 69, 58), "Take a deep breath. It'll get better.");
        JButton excitedButton = createMoodButton("Excited", new Color(144, 238, 144), "Awesome! Keep the energy going!");

        // Add buttons to panel
        moodPanel.add(happyButton);
        moodPanel.add(sadButton);
        moodPanel.add(angryButton);
        moodPanel.add(excitedButton);

        // Add components to frame
        add(titleLabel, BorderLayout.NORTH);
        add(moodPanel, BorderLayout.CENTER);
        add(responseLabel, BorderLayout.SOUTH);

        // Set visible
        setVisible(true);
    }

    // Helper method to create mood buttons
    private JButton createMoodButton(String mood, Color color, String response) {
        JButton button = new JButton(mood);
        button.setBackground(color);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.addActionListener((ActionEvent e) -> {
            moodPanel.setBackground(color);
            responseLabel.setText(response);
        });
        return button;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         SwingUtilities.invokeLater(() -> new MoodTracker());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

