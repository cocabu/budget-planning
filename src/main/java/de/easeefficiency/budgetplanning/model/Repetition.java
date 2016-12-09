package de.easeefficiency.budgetplanning.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Repetition implements Serializable {

	private static final long serialVersionUID = 1L;

	private RepetitionType type;
	private LocalDateTime start;
	private LocalDateTime end;
	
	public Repetition() {}

	public Repetition(RepetitionType type, LocalDateTime start, LocalDateTime end) {
		this.type = type;
		this.start = start;
		this.end = end;
	}

	public RepetitionType getType() {
		return type;
	}

	public void setType(RepetitionType type) {
		this.type = type;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		Repetition other = (Repetition) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Repetition [type=" + type + ", start=" + start + ", end=" + end + "]";
	}

}
