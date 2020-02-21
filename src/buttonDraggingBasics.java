JButton button = new JButton("This is the text");
TransferHandler transfer = new TransferHandler("text");

//the JButton can now be dragged and the text will be dropped
button.setTransferHandler(transfer);

//add a MouseListener to initiate the Drag on the appropriate
//MouseEvent
button.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JButton button = (JButton)e.getSource();
                TransferHandler handle = button.getTransferHandler();
                handle.exportAsDrag(button, e, TransferHandler.COPY);
            }
        });

