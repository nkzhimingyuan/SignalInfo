/*
 *
 * Copyright (c) 2013 Wes Lanning, http://codingcreation.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * http://www.opensource.org/licenses/mit-license.php
 * /
 */

package com.cc.signalinfo;

/**
 * @author Wes Lanning
 * @version 2013-04-29
 */
public enum Signal
{
/*    NONE(0),*/
    GSM_SIG_STRENGTH(1),
    GSM_BIT_ERROR(2),
    CDMA_RSSI(3),
    CDMA_ECIO(4),
    EVDO_RSSI(5),
    EVDO_ECIO(6),
    EVDO_SNR(7),
    LTE_SIG_STRENGTH(8),
    LTE_RSRP(9),
    LTE_RSRQ(10),
    LTE_SNR(11),
    LTE_CQI(12),
    IS_GSM(13),
    LTE_RSSI(14),
    GSM_RSSI(15),
    GSM_ASU(16);

    private int value;

    Signal(int value)
    {
        this.value = value;
    }
}