var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":25419,"methods":[{"el":28,"sc":5,"sl":23},{"el":35,"sc":5,"sl":30}],"name":"BetterFragmenterTest","sl":21},{"el":122,"id":25428,"methods":[{"el":49,"sc":9,"sl":42},{"el":53,"sc":9,"sl":51},{"el":57,"sc":9,"sl":55},{"el":65,"sc":9,"sl":59},{"el":69,"sc":9,"sl":67},{"el":74,"sc":9,"sl":71},{"el":79,"sc":9,"sl":77},{"el":86,"sc":9,"sl":82},{"el":91,"sc":9,"sl":89},{"el":96,"sc":9,"sl":94},{"el":101,"sc":9,"sl":99},{"el":106,"sc":9,"sl":104},{"el":111,"sc":9,"sl":109},{"el":116,"sc":9,"sl":114},{"el":121,"sc":9,"sl":119}],"name":"BetterFragmenterTest.DummyTrack","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_176":{"methods":[{"sl":23},{"sl":30},{"sl":42},{"sl":55},{"sl":59},{"sl":71},{"sl":82}],"name":"testPatterns","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":32},{"sl":33},{"sl":34},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":56},{"sl":60},{"sl":61},{"sl":62},{"sl":64},{"sl":73},{"sl":83},{"sl":84},{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [176], [176], [176], [176], [176], [], [], [176], [], [176], [176], [176], [], [], [], [], [], [], [], [176], [176], [176], [176], [176], [], [], [], [], [], [], [], [], [176], [176], [], [], [176], [176], [176], [176], [], [176], [], [], [], [], [], [], [176], [], [176], [], [], [], [], [], [], [], [], [176], [176], [176], [176], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
