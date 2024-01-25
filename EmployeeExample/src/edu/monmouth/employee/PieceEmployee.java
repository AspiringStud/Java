package edu.monmouth.employee;

public class PieceEmployee implements Employee{
	private int ratePerPiece;
	private int piecesMade;
	
	public PieceEmployee(int ratePerPiece)
	{
		this.ratePerPiece=ratePerPiece;
	}
	public int getMonthlyPay()
	{
		return ratePerPiece*piecesMade;
	}
	public void setPiecesMade(int piecesMade)
	{
		this.piecesMade=piecesMade;
	}
	public String toSring()
	{
		return "The ratePerPiece and piecesMade of PieceEmployee is "+"ratePerPiece "+this.ratePerPiece+" peicesmade "+this.piecesMade+" "+getMonthlyPay();
		
	}
	public boolean equals(Object object)
	{
		if(object instanceof PieceEmployee)
		{
			PieceEmployee pemployee=(PieceEmployee)object;
			return getMonthlyPay()==pemployee.getMonthlyPay();
			
		}
		return false;
	}
}
