/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_order;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
//import java.sql.Statement;

/**
 *
 * @author senafunakubo
 */
public class Payment extends javax.swing.JFrame {

    FinishOrder finish = new FinishOrder();
    Price price1 = new Price(0,0,0,0.0,0);
//    Boolean test = false;
    
    /**
     * Creates new form Payment
     * @param price
     */
    public Payment(Price price) {
        price1 = price;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SushiPageLabel = new javax.swing.JLabel();
        UserInfoPageLabel = new javax.swing.JLabel();
        PaymentPageLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        EmailLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        PhoneNumLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        ZipCodeLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        CashRadio = new javax.swing.JRadioButton();
        CreditRatio = new javax.swing.JRadioButton();
        VisaRatio = new javax.swing.JRadioButton();
        HowWouldLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BluePanel = new javax.swing.JPanel();
        TotalLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        BlueChikuLabel = new javax.swing.JLabel();
        BlueSyoLabel = new javax.swing.JLabel();
        BlueBaiLabel = new javax.swing.JLabel();
        BlueSyoPriceLabel = new javax.swing.JLabel();
        BlueChikuPriceLabel = new javax.swing.JLabel();
        BlueBaiPriceLabel = new javax.swing.JLabel();
        ShoppingCartLabel = new javax.swing.JLabel();
        subTLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        deliFeeLabel = new javax.swing.JLabel();
        subTPriceLabel = new javax.swing.JLabel();
        taxPriceLabel = new javax.swing.JLabel();
        deliFeePriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(251, 251, 251));
        MainPanel.setPreferredSize(new java.awt.Dimension(691, 500));
        MainPanel.setRequestFocusEnabled(false);

        SushiPageLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 0, 14)); // NOI18N
        SushiPageLabel.setForeground(new java.awt.Color(204, 204, 204));
        SushiPageLabel.setText("Sushi");
        SushiPageLabel.setPreferredSize(new java.awt.Dimension(34, 24));

        UserInfoPageLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 0, 14)); // NOI18N
        UserInfoPageLabel.setForeground(new java.awt.Color(204, 204, 204));
        UserInfoPageLabel.setText("UserInfo");

        PaymentPageLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 2, 14)); // NOI18N
        PaymentPageLabel.setForeground(new java.awt.Color(51, 51, 51));
        PaymentPageLabel.setText("Payment");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        firstNameLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        firstNameLabel.setText("First name:");

        lastNameLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        lastNameLabel.setText("Last name:");

        EmailLabel1.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        EmailLabel1.setText("Email:");

        cancelButton.setBackground(new java.awt.Color(251, 251, 251));
        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(81, 29));
        cancelButton.setMinimumSize(new java.awt.Dimension(81, 29));
        cancelButton.setPreferredSize(new java.awt.Dimension(81, 29));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        OrderButton.setBackground(new java.awt.Color(0, 153, 153));
        OrderButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(251, 251, 251));
        OrderButton.setText("Order");
        OrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderButtonMouseClicked(evt);
            }
        });

        PhoneNumLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        PhoneNumLabel.setText("Phone number:");

        AddressLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        AddressLabel.setText("Address:");

        CityLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        CityLabel.setText("City:");

        ZipCodeLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        ZipCodeLabel.setText("Zip code:");

        PasswordLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        PasswordLabel.setText("Password:");

        CashRadio.setBackground(new java.awt.Color(251, 251, 251));
        buttonGroup.add(CashRadio);
        CashRadio.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 11)); // NOI18N
        CashRadio.setText("Cash On Delivery");
        CashRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashRadioMouseClicked(evt);
            }
        });

        CreditRatio.setBackground(new java.awt.Color(251, 251, 251));
        buttonGroup.add(CreditRatio);
        CreditRatio.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 11)); // NOI18N
        CreditRatio.setText("Credit Card");
        CreditRatio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditRatioMouseClicked(evt);
            }
        });

        VisaRatio.setBackground(new java.awt.Color(251, 251, 251));
        buttonGroup.add(VisaRatio);
        VisaRatio.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 11)); // NOI18N
        VisaRatio.setText("VISA Checkout");
        VisaRatio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisaRatioMouseClicked(evt);
            }
        });

        HowWouldLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 0, 13)); // NOI18N
        HowWouldLabel.setText("How would you like to pay ?");

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PhoneNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CashRadio))
                .addGap(60, 60, 60)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ZipCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserInfoPageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CreditRatio))
                        .addGap(60, 60, 60)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VisaRatio)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(481, 481, 481)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PaymentPageLabel)
                                .addComponent(EmailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(HowWouldLabel))
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(SushiPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(UserInfoPageLabel)
                    .addComponent(SushiPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentPageLabel))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(EmailLabel1))
                .addGap(30, 30, 30)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumLabel)
                    .addComponent(AddressLabel))
                .addGap(30, 30, 30)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLabel)
                    .addComponent(ZipCodeLabel)
                    .addComponent(PasswordLabel))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(HowWouldLabel)
                .addGap(28, 28, 28)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CashRadio)
                    .addComponent(CreditRatio)
                    .addComponent(VisaRatio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        BluePanel.setBackground(new java.awt.Color(0, 153, 153));
        BluePanel.setForeground(new java.awt.Color(59, 175, 235));

        TotalLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 10)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalLabel.setText("Total");

        PriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 10)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setText("$0");

        BlueChikuLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueChikuLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueChikuLabel.setText("Chiku");

        BlueSyoLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueSyoLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueSyoLabel.setText("Syo");

        BlueBaiLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueBaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueBaiLabel.setText("Bai");

        BlueSyoPriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueSyoPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueSyoPriceLabel.setText("$0");

        BlueChikuPriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueChikuPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueChikuPriceLabel.setText("$0");

        BlueBaiPriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        BlueBaiPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlueBaiPriceLabel.setText("$0");

        ShoppingCartLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 0, 14)); // NOI18N
        ShoppingCartLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShoppingCartLabel.setText("Shopping Cart");

        subTLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        subTLabel.setForeground(new java.awt.Color(255, 255, 255));
        subTLabel.setText("SubTotal");

        taxLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        taxLabel.setForeground(new java.awt.Color(255, 255, 255));
        taxLabel.setText("Tax");

        deliFeeLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        deliFeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        deliFeeLabel.setText("Delivery Fee");

        subTPriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        subTPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        subTPriceLabel.setText("$0");

        taxPriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        taxPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        taxPriceLabel.setText("$0");

        deliFeePriceLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 0, 10)); // NOI18N
        deliFeePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        deliFeePriceLabel.setText("$0");

        javax.swing.GroupLayout BluePanelLayout = new javax.swing.GroupLayout(BluePanel);
        BluePanel.setLayout(BluePanelLayout);
        BluePanelLayout.setHorizontalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BluePanelLayout.createSequentialGroup()
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BluePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PriceLabel))
                    .addGroup(BluePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BluePanelLayout.createSequentialGroup()
                                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BlueSyoLabel)
                                    .addComponent(BlueChikuLabel)
                                    .addComponent(BlueBaiLabel)
                                    .addComponent(subTLabel)
                                    .addComponent(TotalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BlueSyoPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BlueChikuPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BlueBaiPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subTPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(ShoppingCartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BluePanelLayout.createSequentialGroup()
                                .addComponent(taxLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taxPriceLabel))
                            .addGroup(BluePanelLayout.createSequentialGroup()
                                .addComponent(deliFeeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deliFeePriceLabel)))))
                .addGap(45, 45, 45))
        );
        BluePanelLayout.setVerticalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BluePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ShoppingCartLabel)
                .addGap(52, 52, 52)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueSyoLabel)
                    .addComponent(BlueSyoPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueChikuLabel)
                    .addComponent(BlueChikuPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueBaiLabel)
                    .addComponent(BlueBaiPriceLabel))
                .addGap(45, 45, 45)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTLabel)
                    .addComponent(subTPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliFeeLabel)
                    .addComponent(deliFeePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxLabel)
                    .addComponent(taxPriceLabel))
                .addGap(50, 50, 50)
                .addGroup(BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(TotalLabel))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseClicked
        // TODO add your handling code here:
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.MINUTE, 40);
        SimpleDateFormat sdf1 = new SimpleDateFormat("a hh:mm");
        
        
        finish.ShowTheTime(sdf1.format(cal1.getTime()));
        
        if(CashRadio.isSelected()||CreditRatio.isSelected()||VisaRatio.isSelected()){
            finish.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a payment method.");
        }
    }//GEN-LAST:event_OrderButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        UserInfo userInfo = new UserInfo();
        userInfo.ShowShoppingCart(price1);
        userInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void CashRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashRadioMouseClicked
        // TODO add your handling code here:
        finish.ShowPaymentInfo("Cash");
    }//GEN-LAST:event_CashRadioMouseClicked

    private void CreditRatioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditRatioMouseClicked
        // TODO add your handling code here:
        finish.ShowPaymentInfo("Credit");
    }//GEN-LAST:event_CreditRatioMouseClicked

    private void VisaRatioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisaRatioMouseClicked
        // TODO add your handling code here:
        finish.ShowPaymentInfo("VISA Checkout");
    }//GEN-LAST:event_VisaRatioMouseClicked

    //For first customer
    public void ShowUserInfo(String firstName, String lastName, String email,String phoneNum,String address,String city,String zipCode,String password) throws SQLException{
        firstNameLabel.setText("First name: " + firstName);
        lastNameLabel.setText("Last name: " +lastName);
        EmailLabel1.setText("Email: " + email);
        PhoneNumLabel.setText("Phone number: " + phoneNum);
        AddressLabel.setText("Address: " + address);
        CityLabel.setText("City: " + city);
        ZipCodeLabel.setText("Zip code: " + zipCode);
        String st = password.substring(password.length()-4);
        PasswordLabel.setText("Password: *****" + st);
        
        finish.ShowUserInfo(firstName);
    }
    
    //For registered customer
    public void ShowOldUserInfo(String UfirstName, String UlastName, String Uemail,String UphoneNum, String Uaddress, String Ucity, String UzipCode, String Upassword) throws SQLException{
        firstNameLabel.setText("First name:  " + UfirstName);
        lastNameLabel.setText("Last name:  " +UlastName);
        EmailLabel1.setText("Email:  " + Uemail);
        PhoneNumLabel.setText("Phone number:  " + UphoneNum);
        AddressLabel.setText("Address:  " + Uaddress);
        CityLabel.setText("City:  " + Ucity);
        ZipCodeLabel.setText("Zip code:  " + UzipCode);
        String st = Upassword.substring(Upassword.length()-4);
        PasswordLabel.setText("Password:  *****" + st);
        
        finish.ShowUserInfo(UfirstName);
    }
    
    public void ShowShoppingCart(Price price){
        
        BlueSyoPriceLabel.setText("$" + Integer.toString(price.getSyo()));
        BlueChikuPriceLabel.setText("$" + Integer.toString(price.getChiku()));
        BlueBaiPriceLabel.setText("$" + Integer.toString(price.getBai()));
        
        int subSum = price.getSyo() + price.getChiku() + price.getBai();
        subTPriceLabel.setText("$" + Integer.toString(subSum));
        deliFeePriceLabel.setText("$" + Integer.toString(price.getDfee()));
        
        taxPriceLabel.setText("$" + Double.toString(price.getTax()));
        double allSum = subSum + (double)price.getDfee() + (double)price.getTax();
        PriceLabel.setText("$" + Double.toString(allSum));
        
        finish.ShowPriceInfo(Double.toString(allSum));
        
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Payment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel BlueBaiLabel;
    private javax.swing.JLabel BlueBaiPriceLabel;
    private javax.swing.JLabel BlueChikuLabel;
    private javax.swing.JLabel BlueChikuPriceLabel;
    private javax.swing.JPanel BluePanel;
    private javax.swing.JLabel BlueSyoLabel;
    private javax.swing.JLabel BlueSyoPriceLabel;
    private javax.swing.JRadioButton CashRadio;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JRadioButton CreditRatio;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JLabel HowWouldLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OrderButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PaymentPageLabel;
    private javax.swing.JLabel PhoneNumLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel ShoppingCartLabel;
    private javax.swing.JLabel SushiPageLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel UserInfoPageLabel;
    private javax.swing.JRadioButton VisaRatio;
    private javax.swing.JLabel ZipCodeLabel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel deliFeeLabel;
    private javax.swing.JLabel deliFeePriceLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel subTLabel;
    private javax.swing.JLabel subTPriceLabel;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel taxPriceLabel;
    // End of variables declaration//GEN-END:variables
}