package onlineorderplacementgame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class OnlinePlayersUI extends JFrame {
    private JTable playerTable;

    public OnlinePlayersUI() {
        setTitle("Online Players");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the table model
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Name", "Total Points", "Status"}, 0);

        // Fetch the list of online players
        List<Player> players = PlayerManager.getOnlinePlayers();

        // Populate the table model with player data
        for (Player player : players) {
            model.addRow(new Object[]{player.getName(), player.getTotalPoints(), player.getStatus()});
        }

        // Create the table and set the model
        playerTable = new JTable(model);

        // Add the table to the UI
        JScrollPane scrollPane = new JScrollPane(playerTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OnlinePlayersUI ui = new OnlinePlayersUI();
            ui.setVisible(true);
        });
    }
}
