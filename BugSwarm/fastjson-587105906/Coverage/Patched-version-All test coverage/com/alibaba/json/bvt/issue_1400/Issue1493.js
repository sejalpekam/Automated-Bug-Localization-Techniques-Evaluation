var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":74,"id":61670,"methods":[{"el":18,"sc":5,"sl":15},{"el":52,"sc":5,"sl":20}],"name":"Issue1493","sl":14},{"el":73,"id":61691,"methods":[{"el":60,"sc":9,"sl":58},{"el":64,"sc":9,"sl":62},{"el":68,"sc":9,"sl":66},{"el":72,"sc":9,"sl":70}],"name":"Issue1493.TestBean","sl":54}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_986":{"methods":[{"sl":20},{"sl":58},{"sl":62},{"sl":66},{"sl":70}],"name":"test_for_issue","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":33},{"sl":34},{"sl":41},{"sl":42},{"sl":45},{"sl":46},{"sl":48},{"sl":49},{"sl":59},{"sl":63},{"sl":67},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [986], [], [986], [986], [], [986], [986], [986], [986], [986], [986], [986], [], [986], [986], [], [], [], [], [], [], [986], [986], [], [], [986], [986], [], [986], [986], [], [], [], [], [], [], [], [], [986], [986], [], [], [986], [986], [], [], [986], [986], [], [], [986], [986], [], [], []]
