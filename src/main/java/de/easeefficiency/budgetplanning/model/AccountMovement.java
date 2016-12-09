package de.easeefficiency.budgetplanning.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AccountMovement implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private MovementType type;
	private int amount;
	private LocalDateTime transactionTime;
	private ReasonType reason;
	private String note;
	private Repetition repetition;
	
	public AccountMovement() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MovementType getType() {
		return type;
	}

	public void setType(MovementType type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	public ReasonType getReason() {
		return reason;
	}

	public void setReason(ReasonType reason) {
		this.reason = reason;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Repetition getRepetition() {
		return repetition;
	}

	public void setRepetition(Repetition repetition) {
		this.repetition = repetition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + id;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((repetition == null) ? 0 : repetition.hashCode());
		result = prime * result + ((transactionTime == null) ? 0 : transactionTime.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountMovement other = (AccountMovement) obj;
		if (amount != other.amount)
			return false;
		if (id != other.id)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (reason != other.reason)
			return false;
		if (repetition == null) {
			if (other.repetition != null)
				return false;
		} else if (!repetition.equals(other.repetition))
			return false;
		if (transactionTime == null) {
			if (other.transactionTime != null)
				return false;
		} else if (!transactionTime.equals(other.transactionTime))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountMovement [id=" + id + ", type=" + type + ", amount=" + amount + ", transactionTime="
				+ transactionTime + ", reason=" + reason + ", note=" + note + ", repetition=" + repetition + "]";
	}
	
}
