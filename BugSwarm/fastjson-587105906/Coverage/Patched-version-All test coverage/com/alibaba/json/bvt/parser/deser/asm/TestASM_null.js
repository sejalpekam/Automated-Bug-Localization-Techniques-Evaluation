var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":70,"id":76336,"methods":[{"el":18,"sc":5,"sl":13},{"el":25,"sc":5,"sl":20}],"name":"TestASM_null","sl":11},{"el":69,"id":76344,"methods":[{"el":36,"sc":9,"sl":34},{"el":43,"sc":9,"sl":38},{"el":47,"sc":9,"sl":45},{"el":51,"sc":9,"sl":49},{"el":55,"sc":9,"sl":53},{"el":59,"sc":9,"sl":57},{"el":63,"sc":9,"sl":61},{"el":67,"sc":9,"sl":65}],"name":"TestASM_null.VO","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3108":{"methods":[{"sl":20},{"sl":34},{"sl":45},{"sl":49},{"sl":53},{"sl":57},{"sl":61},{"sl":65}],"name":"test_null_notmatch","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":62},{"sl":66}]},"test_944":{"methods":[{"sl":13},{"sl":34},{"sl":45},{"sl":49},{"sl":53},{"sl":57},{"sl":61},{"sl":65}],"name":"test_null","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":46},{"sl":50},{"sl":54},{"sl":58},{"sl":62},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [944], [944], [944], [944], [], [], [], [3108], [3108], [3108], [3108], [], [], [], [], [], [], [], [], [], [], [944, 3108], [], [], [], [], [], [], [], [], [], [], [944, 3108], [944, 3108], [], [], [944, 3108], [944, 3108], [], [], [944, 3108], [944, 3108], [], [], [944, 3108], [944, 3108], [], [], [944, 3108], [944, 3108], [], [], [944, 3108], [944, 3108], [], [], [], []]
