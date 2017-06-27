/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.omnilink.internal;

/**
 * Omnilink commands
 *
 * @author Dan Cunningham
 * @since 1.5.0
 */
public enum OmniLinkCmd {
    CMD_UNIT_OFF(0),
    CMD_UNIT_ON(1),
    CMD_UNIT_AREA_ALL_OFF(2),
    CMD_UNIT_AREA_ALL_ON(3),
    CMD_BUTTON(7),
    CMD_UNIT_PERCENT(9),
    CMD_UNIT_LO9_LEVEL_HIGH7(101),
    CMD_UNIT_DECREMENT_COUNTER(10),
    CMD_UNIT_INCREMENT_COUNTER(11),
    CMD_UNIT_SET_COUNTER(12),
    CMD_UNIT_LO9_RAMP_HIGH7(13),
    CMD_UNIT_LIGHTOLIER(14),
    CMD_UNIT_UPB_REQ_STATUS(15),
    CMD_UNIT_UPB_DIM_STEP_1(17),
    CMD_UNIT_UPB_DIM_STEP_2(18),
    CMD_UNIT_UPB_DIM_STEP_3(19),
    CMD_UNIT_UPB_DIM_STEP_4(20),
    CMD_UNIT_UPB_DIM_STEP_5(21),
    CMD_UNIT_UPB_DIM_STEP_6(22),
    CMD_UNIT_UPB_DIM_STEP_7(23),
    CMD_UNIT_UPB_DIM_STEP_8(24),
    CMD_UNIT_UPB_DIM_STEP_9(25),
    CMD_UNIT_UPB_BRIGHTEN_STEP_1(33),
    CMD_UNIT_UPB_BRIGHTEN_STEP_2(34),
    CMD_UNIT_UPB_BRIGHTEN_STEP_3(35),
    CMD_UNIT_UPB_BRIGHTEN_STEP_4(36),
    CMD_UNIT_UPB_BRIGHTEN_STEP_5(37),
    CMD_UNIT_UPB_BRIGHTEN_STEP_6(38),
    CMD_UNIT_UPB_BRIGHTEN_STEP_7(39),
    CMD_UNIT_UPB_BRIGHTEN_STEP_8(40),
    CMD_UNIT_UPB_BRIGHTEN_STEP_9(41),
    CMD_UNIT_UPB_LO9_BLINK_HIGH7(26),
    CMD_UNIT_UPB_STOP_BLINK(27),
    CMD_UNIT_UPB_LINK_OFF(28),
    CMD_UNIT_UPB_LINK_ON(29),
    CMD_UNIT_UPB_LINK_SET(30),
    CMD_UNIT_CENTRALITE_SCENE_OFF(42),
    CMD_UNIT_CENTRALITE_SCENE_ON(43),
    CMD_UNIT_UPB_LED_OFF(44),
    CMD_UNIT_UPB_LED_ON(45),
    CMD_UNIT_RADIORA_PHANTOM_BUTTON_OFF(46),
    CMD_UNIT_RADIORA_PHANTOM_BUTTON_ON(46),
    CMD_UNIT_LEVITON_SCENE_OFF(60),
    CMD_UNIT_LEVITON_SCENE_ON(60),
    CMD_UNIT_LEVITON_SCENE_SET(60),

    CMD_SECURITY_OMNI_DISARM(48),
    CMD_SECURITY_OMNI_DAY_MODE(49),
    CMD_SECURITY_OMNI_NIGHT_MODE(50),
    CMD_SECURITY_OMNI_AWAY_MODE(51),
    CMD_SECURITY_OMNI_VACATION_MODE(52),
    CMD_SECURITY_OMNI_DAY_INSTANCE_MODE(53),
    CMD_SECURITY_OMNI_NIGHT_DELAYED_MODE(54),
    CMD_SECURITY_BYPASS_ZONE(4),
    CMD_SECURITY_RESTORE_ZONE(5),
    CMD_SECURITY_RESTORE_ALL_ZONES(6),
    CMD_SECURITY_LUMINA_HOME_MODE(49),
    CMD_SECURITY_LUMINA_SLEEP_MODE(50),
    CMD_SECURITY_LUMINA_AWAY_MODE(51),
    CMD_SECURITY_LUMINA_VACATION_MODE(52),
    CMD_SECURITY_LUMINA_PARTY_MODE(53),
    CMD_SECURITY_LUMINA_SPECIAL_MODE(54),

    CMD_ENERGY_SAVER_OFF(64),
    CMD_ENERGY_SAVER_ON(65),

    CMD_THERMO_SET_HEAT_POINT(66),
    CMD_THERMO_SET_COOL_POINT(67),
    CMD_THERMO_SET_SYSTEM_MODE(68),
    CMD_THERMO_SET_FAN_MODE(69),
    CMD_THERMO_SET_HOLD_MODE(70),
    CMD_THERMO_RAISE_LOWER_HEAT(71),
    CMD_THERMO_RAISE_LOWER_COOL(72),

    CMD_MESSAGE_SHOW_MESSAGE_WITH_BEEP_AND_LED(80),
    CMD_MESSAGE_SHOW_MESSAGE_WITH_BEEP_OR_LED(86),
    CMD_MESSAGE_LOG_MESSAGE(81),
    CMD_MESSAGE_CLEAR_MESSAGE(82),
    CMD_MESSAGE_SAY_MESSAGE(83),
    CMD_MESSAGE_PHONE_AND_SAY_MESSAGE(84),
    CMD_MESSAGE_SEND_MESSAGE_TO_SERIAL_PORT(85),

    CMD_CONSOLE_ENABLE_DISABLE_BEEPER(102),
    CMD_CONSOLE_BEEP(102),

    CMD_AUDIO_ZONE_SET_ON_MUTE(112),
    CMD_AUDIO_ZONE_SET_VOLUME(113),
    CMD_AUDIO_ZONE_SET_SOURCE(114),
    CMD_AUDIO_ZONE_SELECT_KEY(115),

    SENSOR_UNIT_POWER(1001),
    SENSOR_UNIT_LEVEL(1002),
    SENSOR_UNIT_DISPLAY(1003),
    SENSOR_THERMO_HEAT_POINTC(2001),
    SENSOR_THERMO_HEAT_POINTF(2002),
    SENSOR_THERMO_COOL_POINTC(2003),
    SENSOR_THERMO_COOL_POINTF(2004),
    SENSOR_THERMO_SYSTEM_MODE(2005),
    SENSOR_THERMO_FAN_MODE(2006),
    SENSOR_THERMO_HOLD_MODE(2007),
    SENSOR_THERMO_TEMPC(2006),
    SENSOR_THERMO_TEMPF(2007),
    SENSOR_ZONE_STATUS_CURRENT(3001),
    SENSOR_ZONE_STATUS_LATCHED(3002),
    SENSOR_ZONE_STATUS_ARMING(3003),
    SENSOR_AREA_STATUS_MODE(4001),
    SENSOR_AREA_STATUS_ALARM(4002),
    SENSOR_AREA_STATUS_EXIT_DELAY(4003),
    SENSOR_AREA_STATUS_ENTRY_DELAY(4003),
    SENSOR_AREA_EXIT_TIMER(4004),
    SENSOR_AREA_ENTRY_TIMER(4005),
    SENSOR_AUX_STATUS(5001),
    SENSOR_AUX_CURRENTC(5002),
    SENSOR_AUX_CURRENTF(5003),
    SENSOR_AUX_LOWC(5004),
    SENSOR_AUX_LOWF(5005),
    SENSOR_AUX_HIGHC(5006),
    SENSOR_AUX_HIGHF(5007),
    SENSOR_AUDIOZONE_POWER(6001),
    SENSOR_AUDIOZONE_SOURCE(6002),
    SENSOR_AUDIOZONE_VOLUME(6003),
    SENSOR_AUDIOZONE_MUTE(6004),
    SENSOR_AUDIOZONE_TEXT(6005),
    SENSOR_AUDIOZONE_TEXT_FIELD1(6006),
    SENSOR_AUDIOZONE_TEXT_FIELD2(6007),
    SENSOR_AUDIOZONE_TEXT_FIELD3(6008),
    SENSOR_AUDIOSOURCE_TEXT(7001),
    SENSOR_AUDIOSOURCE_TEXT_FIELD1(7002),
    SENSOR_AUDIOSOURCE_TEXT_FIELD2(7003),
    SENSOR_AUDIOSOURCE_TEXT_FIELD3(7004);

    private int number;

    OmniLinkCmd(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static OmniLinkCmd getCommand(String name) {
        for (OmniLinkCmd command : OmniLinkCmd.values()) {
            if (name.equals(command.toString())) {
                return command;
            }
        }
        return null;
    }

    public static OmniLinkCmd getCommand(int ordinal) {
        OmniLinkCmd[] values = OmniLinkCmd.values();
        if (ordinal < values.length) {
            return values[ordinal];
        } else {
            return null;
        }
    }

    public static String toList() {
        StringBuilder sb = new StringBuilder();
        for (OmniLinkCmd command : OmniLinkCmd.values()) {
            sb.append(command.toString()).append(",");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toList());
    }
}
