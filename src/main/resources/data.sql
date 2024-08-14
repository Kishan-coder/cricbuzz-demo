INSERT INTO TEAM (id, name, p, w, nrr) VALUES (1, 'CSK', 3, 2, 0.4);
INSERT INTO TEAM (id, name, p, w, nrr) VALUES (2, 'RR', 0, 0, 0);
INSERT INTO TEAM (id, name, p, w, nrr) VALUES (3, 'RCB', 0, 0, 0);
INSERT INTO TEAM (id, name, p, w, nrr) VALUES (4, 'SRH', 0, 0, 0);
INSERT INTO TEAM (id, name, p, w, nrr) VALUES (5, 'DC', 0, 0, 0);
INSERT INTO TEAM (id, name, p, w, nrr) VALUES (6, 'KKR', 0, 0, 0);

INSERT INTO MATCH (id, team_id1, team_id2, winteam_id, nrr, date) values (1, 1,5,5,0.3,CURRENT_DATE());
INSERT INTO MATCH (id, team_id1, team_id2, winteam_id, nrr, date) values (2, 1,4,1,0.6,CURRENT_DATE());
INSERT INTO MATCH (id, team_id1, team_id2, winteam_id, nrr, date) values (3, 2,3,3,0.5,CURRENT_DATE());
INSERT INTO MATCH (id, team_id1, team_id2, winteam_id, nrr, date) values (4, 3,5,4,0.33,CURRENT_DATE());
INSERT INTO MATCH (id, team_id1, team_id2, winteam_id, nrr, date) values (5, 1,6,1,0.1,CURRENT_DATE());