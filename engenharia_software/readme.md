-  We see three critical differences between programming and software engineering: time, scale,
and the trade-offs at play. On a software engineering project, engineers need to be more concerned 
with the passage of time and the eventual need for change. In a software engineering organization, 
we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization 
that is producing it. Finally, as software engineers, we are asked to make more complex decisions
with higher-stakes outcomes, often based on imprecise estimates of time and growth.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-  Basicamente a engenharia de software se baseia na gestão de tempo, escala
e trade-offs, é uma profissão em que os engenheiros precisam saber lidar
com as mudanças que podem ocorrer nos projetos ao longo do tempo, o que
afeta diretamente no processo de organização da engenharia, é importante
também se preocupar com a escala da eficiência, pois também afeta todo o
processo de produção, finalmente a engenharia de software é responsável
por responder as questões mais complexas e de alto risco para gerar estimativas
de tempo e crescimento, vale se atentar para o fato de que, se for um trabalho
desleixado pode gerar dados imprecisos.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-  Within Google, we sometimes say, “Software engineering is programming integrated over time.” 
Programming is certainly a significant part of software engineering: after all, programming is 
how you generate new software in the first place. If you accept this distinction, it also becomes 
clear that we might need to delineate between programming tasks (development) and software engineering 
tasks (development, modification, maintenance). The addition of time adds an important new dimension to 
programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-  basicamente pelo google podemos encontrar que engenharia de software é uma programação integrada ao longo do tempo.
e que programação certamente é uma parte significantiva da engenharia de programação: depois de tudo, programação
é sobre com você cria e gera um novo software em primeiro lugar. E se você aceita essa distinção, isso fica mais claro[]
de se entender, o que são tarefas de programação e o que são tarefas de engenharia de software. Conforme o passar do tempo
novas dimensões de programação passaram a existir. Cubos não são quadrados, distancia não significa velocidade e 
Engenharia de software não é necessáriamente programação.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-  Com base nestes dois trechos, 3 exemplos de trade-offs são:
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Funcionalidade x Validação
  
    "Para mim os trade-offs em programação costumam ocorrer quando o tempo de entrega de uma funcionalidade está com um prazo curtissimo
    ou seja, opto por criar uma funcionalidade no sistema e as vezes preciso deixar de lado a validação de algumas coisas 'menos' importantes.
    Exemplo em uma empresa que monitora dados, eu trago o monitoramento de um novo banco de dados, mas não tenho tempo de trazer o design 
    completamente funcional para as outras páginas!"

  Manutenção x Desempenho.

    Quando opto por desempenho no meu site de forma a adicionar mais conteúdos e funcionalidadesmas perco em manutenbilidade quando meu código 
    fica complexo por que foram simplesmente jogadas funcionalidades dentro do código, sem identação, sem 'limpeza', então fica um código sujo
    e de dificil manutenbilidade.

  Segurança x Usabilidade.

    Quando opto por muita segurança em dois fatores POR EXEMPLO, quando meu usuário preenche a senha e então ele tem que colocar a digital
    e depois tem que preencher que não é um robo, ou seja ganhei mais segurança mas perdi na parte de usabilidade e dependendo de quão 
    complexa ficarem as autenticações, pior fica a usabilidade de usuário.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Por que um e-commerce vende mais que os outros ?
Requisito não-funcional
- Ambos tem as 'mesmas' coisas, fazem venda por pix, vendem on-line, entrega sem frete.
- Exemplo fui comprar na Americanas, era fim de ano, entrei no site e apareceu um papai noel e toda hora sem querer
abria propagando e redirecionava para outros sites, resumo ? depois de muito tentar, o cliente desiste e vai para outro site
'Amazon'.

3 - Atividade (Steam e EpicGames) - Escolha outro exemplo e faça essa mesma atividade (Chat)
    
    Ambos são aplicativos de jogos on-line entretanto a Steam conta com super usabilidade de usuário e tem diversos acessos e compras 
    inclusive. Já a EpicGames por mais que faça exatamente o mesmo serviço, a usabilidade é pessima, não roda direito em praticamente
    todos os computadores fazendo com que o usuários sofram com a lentidão de donwloads e ainda com poucos jogos atuais disponíveis.

ATIVIDADE 21-08-2023

[Uploading Biblioteca.drawio…]()<mxfile host="app.diagrams.net" modified="2023-08-21T23:12:00.849Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36 OPR/100.0.0.0" etag="uHa69YOq845QC-SL9M6g" version="21.6.8" type="device">
  <diagram name="Página-1" id="ZHeiRIzCR86s6FnEl8aW">
    <mxGraphModel dx="883" dy="505" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="mEWZMtl0eUW2mmlCi85--11" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0.5;exitDx=0;exitDy=0;exitPerimeter=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--1" target="mEWZMtl0eUW2mmlCi85--2">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--1" value="Usuário" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="55" y="280" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--12" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--2" target="mEWZMtl0eUW2mmlCi85--9">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--2" value="Buscar Livro" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="125" y="280" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--10" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0.5;exitDx=0;exitDy=0;exitPerimeter=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--4" target="mEWZMtl0eUW2mmlCi85--8">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--4" value="Sistema" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="715" y="280" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--17" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--8" target="mEWZMtl0eUW2mmlCi85--13">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--8" value="Exibir Livros Disponíveis" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="545" y="280" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--20" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--9" target="mEWZMtl0eUW2mmlCi85--18">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--9" value="Selecionar Livros da Lista" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="225" y="180" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--22" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;endArrow=open;endFill=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--13" target="mEWZMtl0eUW2mmlCi85--21">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--13" value="Informações dos Livros" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="455" y="180" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--29" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0;exitY=0.5;exitDx=0;exitDy=0;entryX=0.414;entryY=-0.001;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--18" target="mEWZMtl0eUW2mmlCi85--25">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--18" value="Empréstimo de Livro" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="280" y="340" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--27" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--21" target="mEWZMtl0eUW2mmlCi85--26">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--21" value="Disponibilidade para empréstimo" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="440" y="360" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--23" value="Devolução Livro" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="225" y="500" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--24" value="Recolhe os Livros Devolvidos" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="480" y="500" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--30" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--25" target="mEWZMtl0eUW2mmlCi85--23">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--25" value="Solicitar Renovação Empréstimo" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="140" y="410" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--38" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--26" target="mEWZMtl0eUW2mmlCi85--24">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--26" value="Verifica Renovação do Empréstimo" style="ellipse;whiteSpace=wrap;html=1;fillColor=#7DB1FF;" vertex="1" parent="1">
          <mxGeometry x="575" y="420" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--37" value="&amp;lt;&amp;lt;Extend&amp;gt;&amp;gt;" style="endArrow=open;startArrow=open;html=1;rounded=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;startFill=0;endFill=0;dashed=1;" edge="1" parent="1" source="mEWZMtl0eUW2mmlCi85--23" target="mEWZMtl0eUW2mmlCi85--24">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="340" y="580" as="sourcePoint" />
            <mxPoint x="390" y="530" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="mEWZMtl0eUW2mmlCi85--41" value="Sistema de Biblioteca" style="swimlane;startSize=0;fontSize=20;verticalAlign=middle;fontStyle=2;fontColor=#3399FF;" vertex="1" parent="1">
          <mxGeometry x="110" y="150" width="590" height="460" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>

