/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 @ApiInfo(
 group="Truffle"
 )
 */
/**
 * Various utility classes that aim to make the development of TruffleLanguage guest languages
 * easier.
 *
 * <p>
 * We try to capture common language patterns in this package. Here is an overview of patterns that
 * we have captured so far:
 * <ul>
 * <li>{@link com.oracle.truffle.api.utilities.AssumedValue} speculates on global values to remain
 * unchanged.</li>
 * <li>{@link com.oracle.truffle.api.utilities.CyclicAssumption} speculates on assumptions that
 * might invalidate more often but are assumed to stabilize over time.</li>
 * <li>{@link com.oracle.truffle.api.utilities.NeverValidAssumption} utility for assumptions that
 * are always invalidated</li>
 * <li>{@link com.oracle.truffle.api.utilities.UnionAssumption} utility for the union of two
 * assumptions</li>
 * </ul>
 * </p>
 *
 * @since 0.8 or older
 */
package com.oracle.truffle.api.utilities;
