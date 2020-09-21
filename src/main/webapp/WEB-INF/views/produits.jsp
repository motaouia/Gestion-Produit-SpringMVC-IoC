<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<title>Gestion Produits</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>

	<div id="formProduit" align="center">
		<f:form modelAttribute="produit" method="post" action="saveProduit">
		
			<table>
				<tr>
					<td>Reference</td>
					<td><f:input path="referenceProduit" /></td>
					<td><f:errors path="referenceProduit" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><f:input path="designationProduit" /></td>
					<td><f:errors path="designationProduit" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Prix</td>
					<td><f:input path="prixProduit" /></td>
					<td><f:errors path="prixProduit" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>Quantite</td>
					<td><f:input path="quantiteProduit" /></td>
					<td><f:errors path="quantiteProduit" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>
						<button type="submit">Save</button>
					</td>
				</tr>
			</table>
			

		</f:form>
	</div>


	<div id="listProds" align="center">
		<table class="table1">
			<tr>
				<th>Reference Produit </th>
				<th>Designation Produit </th>
				<th>Prix Produit </th>
				<th>Quantite Produit </th>
			</tr>
			<c:forEach items="${listProds}" var="p">
				<tr>
					<td>${p.referenceProduit}</td>
					<td>${p.designationProduit}</td>
					<td>${p.prixProduit}</td>
					<td>${p.quantiteProduit}</td>
				</tr>
			
			
			</c:forEach>
		</table>
	</div>
</body>
</html>