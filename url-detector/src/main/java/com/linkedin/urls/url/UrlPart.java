/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.linkedin.urls.url;

public enum UrlPart {
  FRAGMENT(null),
  QUERY(FRAGMENT),
  PATH(QUERY),
  PORT(PATH),
  HOST(PORT),
  USERNAME_PASSWORD(HOST),
  SCHEME(USERNAME_PASSWORD);

  /**
   * This is the next url part that follows.
   */
  private UrlPart _nextPart;

  UrlPart(UrlPart nextPart) {
    _nextPart = nextPart;
  }

  public UrlPart getNextPart() {
    return _nextPart;
  }
}

