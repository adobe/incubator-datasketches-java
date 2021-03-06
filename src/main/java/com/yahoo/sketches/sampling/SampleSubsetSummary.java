/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.yahoo.sketches.sampling;

/**
 * A simple object o capture the results of a subset sum query on a sampling sketch.
 *
 * @author Jon Malkin
 */
public class SampleSubsetSummary {
  private double lowerBound;
  private double estimate;
  private double upperBound;
  private double totalSketchWeight;

  SampleSubsetSummary(final double lowerBound,
                      final double estimate,
                      final double upperBound,
                      final double totalSketchWeight) {
    this.lowerBound        = lowerBound;
    this.estimate          = estimate;
    this.upperBound        = upperBound;
    this.totalSketchWeight = totalSketchWeight;
  }

  public double getLowerBound() {
    return lowerBound;
  }

  public double getTotalSketchWeight() {
    return totalSketchWeight;
  }

  public double getUpperBound() {
    return upperBound;
  }

  public double getEstimate() {
    return estimate;
  }
}
