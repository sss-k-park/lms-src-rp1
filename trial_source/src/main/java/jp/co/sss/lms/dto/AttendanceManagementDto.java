package jp.co.sss.lms.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 勤怠管理画面用DTO
 * 
 * @author 東京ITスクール
 */
@Component
@Data
@EqualsAndHashCode(callSuper = true)
public class AttendanceManagementDto extends StudentAttendanceDto {

	/** 当日フラグ */
	private Boolean isToday;
	/** 中抜け時間（文字列） */
	private String blankTimeValue;
	/** セクション名 */
	private String sectionName;
	/** 出勤時間（時）（task26) */
	private Integer attendanceStartHour;
	/** 出勤時間（分）（task26) */
	private Integer attendanceStartMinute;
	/** 退勤時間（時）（task26) */
	private Integer attendanceEndHour;
	/** 退勤時間（分）（task26) */
	private Integer attendanceEndMinute;
	

}
