var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":96,"id":18762,"methods":[{"el":22,"sc":5,"sl":20},{"el":31,"sc":5,"sl":24},{"el":42,"sc":5,"sl":34},{"el":50,"sc":5,"sl":44},{"el":54,"sc":5,"sl":52},{"el":58,"sc":5,"sl":56}],"name":"FontTableBox","sl":15},{"el":95,"id":18785,"methods":[{"el":65,"sc":9,"sl":64},{"el":70,"sc":9,"sl":67},{"el":76,"sc":9,"sl":72},{"el":82,"sc":9,"sl":78},{"el":86,"sc":9,"sl":84},{"el":94,"sc":9,"sl":88}],"name":"FontTableBox.FontRecord","sl":60}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_24":{"methods":[{"sl":20},{"sl":56},{"sl":67}],"name":"test","pass":true,"statements":[{"sl":21},{"sl":57},{"sl":68},{"sl":69}]},"test_60":{"methods":[{"sl":20},{"sl":24},{"sl":34},{"sl":44},{"sl":52},{"sl":64},{"sl":72},{"sl":78},{"sl":84}],"name":"testRoundTrip_1e","pass":false,"statements":[{"sl":21},{"sl":26},{"sl":27},{"sl":28},{"sl":30},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":46},{"sl":47},{"sl":48},{"sl":53},{"sl":73},{"sl":74},{"sl":75},{"sl":79},{"sl":80},{"sl":81},{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [24, 60], [24, 60], [], [], [60], [], [60], [60], [60], [], [60], [], [], [], [60], [], [60], [60], [60], [60], [60], [], [], [], [60], [], [60], [60], [60], [], [], [], [60], [60], [], [], [24], [24], [], [], [], [], [], [], [60], [], [], [24], [24], [24], [], [], [60], [60], [60], [60], [], [], [60], [60], [60], [60], [], [], [60], [60], [], [], [], [], [], [], [], [], [], [], []]
